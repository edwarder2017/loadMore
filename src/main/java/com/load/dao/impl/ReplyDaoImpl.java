package com.load.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.load.dao.ReplyDao;
import com.load.entity.Reply;
import com.load.template.JdbcTemplate;
import com.load.template.interf.SqlQuerier;
import com.load.util.JdbcUtil;

/**   
*    
* 项目名称：loadMore   
* 类名称：ReplyDaoImpl   
* 类描述：   
* 创建人：edwarder   
* 创建时间：2017年7月18日 下午9:32:50   
*       
*/
public class ReplyDaoImpl implements ReplyDao {

	@Override
	public Integer getTotal() {
		JdbcTemplate<Integer> template = new JdbcTemplate<>();
		return template.query(new SqlQuerier<Integer>() {
			
			@Override
			public Integer execute(Connection con) throws SQLException {
				Integer count = 0;
				String sql = "select count(*) from bbs_reply";
				PreparedStatement pst = null;
				ResultSet rs = null;
				try {
					pst = con.prepareStatement(sql);
					rs = pst.executeQuery();
					if (rs.next()) {
						count = rs.getInt(1);
					}
				} finally {
					JdbcUtil.close(rs, pst, null);
				}
				return count;
			}
		});
	}

	@Override
	public List<Reply> getReplyByPage(Integer currentPage, Integer pageCount) {
		JdbcTemplate<List<Reply>> template = new JdbcTemplate<>();
		return template.query(new SqlQuerier<List<Reply>>() {
			
			@Override
			public List<Reply> execute(Connection con) throws SQLException {
				String sql = "select * from (select t.*,rownum rn from bbs_reply t "
						+ "where rownum <= " + currentPage * pageCount + ") a "
						+ "where a.rn > " + (currentPage - 1) * pageCount;
				System.out.println(sql);
				PreparedStatement pst = null;
				ResultSet rs = null;
				List<Reply> replies = null;
				try {
					pst = con.prepareStatement(sql);
					rs = pst.executeQuery();
					// 如果预编译语句对象能够正常创建和执行, 则初始化"省份列表"对象
					replies = new ArrayList<>();
					while(rs.next()) {
						// 封装完成一个省份对象
						Reply reply = new Reply();
						reply.setName(rs.getString("name"));
						reply.setTitle(rs.getString("title"));
						reply.setContent(rs.getString("content"));
						
						// 把封装好的省份对象添加进最后要返回的列表对象中
						replies.add(reply);
					}
				} finally {
					JdbcUtil.close(rs, pst, null);
				}
				return replies;
			}
		});
	}

}
