package com.xsushirollx.sushibyte.restaurantservice.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.xsushirollx.sushibyte.restaurantservice.model.RelevanceSearch;

public interface RelevanceSearchDAO extends JpaRepository<RelevanceSearch, Long>{
	List<RelevanceSearch> findByKeywordsSortByRelevance(@Param("keywords") String keywords, @Param("rating") Double rating, @Param("active")Integer active, 
			@Param("one") Integer one, @Param("two") Integer two, @Param("three") Integer three, @Param("four") Integer four, Pageable pageRequest);

}
