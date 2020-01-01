package cn.whxlover.mapper;

import cn.whxlover.pojo.UserHistory;
import cn.whxlover.pojo.UserHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserHistoryMapper {
    int countByExample(UserHistoryExample example);

    int deleteByExample(UserHistoryExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(UserHistory record);

    int insertSelective(UserHistory record);

    List<UserHistory> selectByExample(UserHistoryExample example);

    UserHistory selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") UserHistory record, @Param("example") UserHistoryExample example);

    int updateByExample(@Param("record") UserHistory record, @Param("example") UserHistoryExample example);

    int updateByPrimaryKeySelective(UserHistory record);

    int updateByPrimaryKey(UserHistory record);
}