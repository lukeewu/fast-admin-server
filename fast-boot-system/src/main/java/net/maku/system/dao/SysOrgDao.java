package net.maku.system.dao;

import net.maku.framework.common.dao.BaseDao;
import net.maku.system.entity.SysOrgEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 机构管理
 * 
 * @author 
 */
@Mapper
public interface SysOrgDao extends BaseDao<SysOrgEntity> {

    List<SysOrgEntity> getList(Map<String, Object> params);

    /**
     * 获取所有机构的id、pid列表
     */
    List<SysOrgEntity> getIdAndPidList();

}