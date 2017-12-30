package com.load.dao;

import java.util.List;

import com.load.entity.Reply;

/**   
*    
* 项目名称：loadMore   
* 类名称：ReplyDao   
* 类描述：   
* 创建人：edwarder   
* 创建时间：2017年7月18日 下午9:31:28   
*       
*/
public interface ReplyDao {
	
	Integer getTotal();
	
	List<Reply> getReplyByPage(Integer currentPage, Integer pageCount);

}
