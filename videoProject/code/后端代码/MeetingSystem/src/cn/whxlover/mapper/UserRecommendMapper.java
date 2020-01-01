package cn.whxlover.mapper;

import cn.whxlover.pojo.UserRecommend;
import cn.whxlover.pojo.UserRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRecommendMapper {
    int countByExample(UserRecommendExample example);

    int deleteByExample(UserRecommendExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(UserRecommend record);

    int insertSelective(UserRecommend record);

    List<UserRecommend> selectByExample(UserRecommendExample example);

    UserRecommend selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") UserRecommend record, @Param("example") UserRecommendExample example);

    int updateByExample(@Param("record") UserRecommend record, @Param("example") UserRecommendExample example);

    int updateByPrimaryKeySelective(UserRecommend record);

    int updateByPrimaryKey(UserRecommend record);
}