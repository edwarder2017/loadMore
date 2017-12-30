package com.load.service.impl;

import com.alibaba.fastjson.JSON;
import com.load.dao.ReplyDao;
import com.load.dao.impl.ReplyDaoImpl;
import com.load.service.ReplyService;

/**   
*    
* 项目名称：loadMore   
* 类名称：ReplyServiceImpl   
* 类描述：   
* 创建人：edwarder   
* 创建时间：2017年7月18日 下午9:30:38   
*       
*/
public class ReplyServiceImpl implements ReplyService {
	private ReplyDao replyDao = new ReplyDaoImpl();

	@Override
	public Integer getTotalPage(Integer pageCount) {
		Integer total = replyDao.getTotal();
		return (total - 1) / pageCount + 1;
	}

	@Override
	public String getReplyByPage(Integer currentPage, Integer pageCount) {
		return JSON.toJSONString(replyDao.getReplyByPage(currentPage, pageCount));
	}

}
