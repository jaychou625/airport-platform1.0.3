package com.br.controller.config;

import com.br.service.service.task.handler.ApronDataHandler;
import com.br.service.service.task.handler.XYXDataHandler;
import com.br.service.service.task.handler.XYXXmlVisitor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 任务相关 配置
 *
 * @Author Zero
 * @Date 2019 02 21
 */
@Configuration
public class TaskConfig {

    /**
     * 站坪数据处理
     *
     * @return ApronDataHandler
     */
    @Bean
    public ApronDataHandler apronDataHandler() {
        return new ApronDataHandler();
    }

    /**
     * 新运行数据处理
     *
     * @return ApronDataHandler
     */
    @Bean
    public XYXDataHandler xyxDataHandler() {
        return new XYXDataHandler();
    }


    /**
     * 新运行XML观察者
     *
     * @return XYXXmlVisitor
     */
    @Bean
    public XYXXmlVisitor xyxXmlVisitor() {
        return new XYXXmlVisitor();
    }
}
