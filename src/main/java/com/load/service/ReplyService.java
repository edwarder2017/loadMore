package com.load.service;

/**   
*    
* 项目名称：loadMore   
* 类名称：ReplyService   
* 类描述：   
* 创建人：edwarder   
* 创建时间：2017年7月18日 下午9:27:30   
*       
*/
public interface ReplyService {
	
	/**
	 * 获取总的页数
	 * @return 总页数
	 */
	Integer getTotalPage(Integer pageCount);
	
	String getReplyByPage(Integer currentPage, Integer pageCount);

}
