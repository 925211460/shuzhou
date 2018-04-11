package com.shuzhou.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by Administrator on 2018/4/11 0011.
 * 这里实现一个自己的接口,继承通用的mapper，关键点就是这个接口不能被扫描到，不能跟dao这个存放mapper文件放在一起。
 最后在启动类中通过MapperScan注解指定扫描的mapper路径：
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T>{

}
