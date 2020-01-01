package cn.whxlover.mapper;

import cn.whxlover.pojo.TopClass;
import cn.whxlover.pojo.TopClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopClassMapper {
    int countByExample(TopClassExample example);

    int deleteByExample(TopClassExample example);

    int deleteByPrimaryKey(Integer topId);

    int insert(TopClass record);

    int insertSelective(TopClass record);

    List<TopClass> selectByExample(TopClassExample example);

    TopClass selectByPrimaryKey(Integer topId);

    int updateByExampleSelective(@Param("record") TopClass record, @Param("example") TopClassExample example);

    int updateByExample(@Param("record") TopClass record, @Param("example") TopClassExample example);

    int updateByPrimaryKeySelective(TopClass record);

    int updateByPrimaryKey(TopClass record);
}