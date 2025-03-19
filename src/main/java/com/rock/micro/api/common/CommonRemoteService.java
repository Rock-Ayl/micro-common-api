package com.rock.micro.api.common;

/**
 * 通用服务远程接口
 *
 * @Author ayl
 * @Date 2024-10-30
 */
public interface CommonRemoteService {

    /**
     * 测试
     *
     * @return
     */
    String helloWorld();

    /**
     * 测试2
     *
     * @param word 测试单词
     * @return
     */
    String helloWorld2(String word);

}