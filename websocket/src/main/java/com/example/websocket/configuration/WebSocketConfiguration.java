package com.example.websocket.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * @EnableWebSocket 开启WebSocket服务
 */
@Configuration
@EnableWebSocket
public class WebSocketConfiguration implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        // var1 WebSocketHandler的实现类实例，处理session收到的消息
        // var2 表示一个或多个websocket连接的映射路径
        webSocketHandlerRegistry.addHandler(new MySocketHandler(), "/ws", "/ws/endpoint");
    }

}
