package cn.itcast.mp.generator.user.mapper;

import cn.itcast.mp.generator.user.entity.TbUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author itcast
 * @since 2023-08-02
 */
public interface TbUserMapper extends BaseMapper<TbUser> {
        TbUser  findByID();
}
