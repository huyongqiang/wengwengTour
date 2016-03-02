package com.tour.account.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.tour.account.entity.Order;
import com.tour.common.dao.IMybatisDao;
import com.tour.frame.utils.page.Pagination;

/**
 * 
 * @author <Auto generate>
 * @version 2015-07-15
 * @see com.tour.account.dao.Account
 */
@Repository
public interface OrderDao extends IMybatisDao<Order,Long>{

	/**
	 * 分页查找
	 * 
	 * @param account
	 * @param pagination
	 * @return
	 */
	List<Order> listPage(@Param("order") Order order,
			@Param("pagination") Pagination pagination);
	List<Order> findBy(@Param("userid")Long userid, @Param("order") Order order,
			@Param("pagination") Pagination pagination);

}
