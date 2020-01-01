package cn.whxlover.mapper;

import cn.whxlover.pojo.History;
import cn.whxlover.pojo.HistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HistoryMapper {
    int countByExample(HistoryExample example);

    int deleteByExample(HistoryExample example);

    int deleteByPrimaryKey(Integer hid);

    int insert(History record);

    int insertSelective(History record);

    List<History> selectByExample(HistoryExample example);

    History selectByPrimaryKey(Integer hid);

    int updateByExampleSelective(@Param("record") History record, @Param("example") HistoryExample example);

    int updateByExample(@Param("record") History record, @Param("example") HistoryExample example);

    int updateByPrimaryKeySelective(History record);

    int updateByPrimaryKey(History record);
}