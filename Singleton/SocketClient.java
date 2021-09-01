package com.company.design.Singleton;

public class SocketClient {

    private static SocketClient socketClient = null;
    //자기자신을 객체로 가지고 있어야한다
    private SocketClient(){
    // 기본생성자를 private으로 설정
    }

    public static SocketClient getInstance(){ //static 메소드로 getInstance만들어줘야 바깥에서 접근가능

        if(socketClient == null){
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }
}
