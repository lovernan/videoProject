package cn.whxlover.mapper;

import cn.whxlover.pojo.Relations;
import cn.whxlover.pojo.RelationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationsMapper {
    int countByExample(RelationsExample example);

    int deleteByExample(RelationsExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Relations record);

    int insertSelective(Relations record);

    List<Relations> selectByExample(RelationsExample example);

    Relations selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Relations record, @Param("example") RelationsExample example);

    int updateByExample(@Param("record") Relations record, @Param("example") RelationsExample example);

    int updateByPrimaryKeySelective(Relations record);

    int updateByPrimaryKey(Relations record);
}