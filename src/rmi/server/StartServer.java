package rmi.server;

import java.rmi.Naming;

public class StartServer {

    public static void main(String[] args) throws Exception {
        
        
        //启动服务步骤
        //1.在项目编译根目录下执行： rmic rmi.server.CalcServerImpl  rmic后面须跟包名+类名
        //  会生成一个class文件 存根 CalcServerImpl_Stub.class
        //2.启动注册服务： start rmiregistry 9998  须在编译根目录下执行此命令
        
        //客户端调用步骤
        //将接口和CalcServerImpl_Stub.class复制到客户端，即可直接调用
        
        CalcServer calcServer = new CalcServerImpl();
        //绑定调用方法
        //Naming.bind("calc", calcServer);
        //覆盖相同的并绑定
        Naming.rebind("//localhost:9998/calc", calcServer);
        System.out.println("Rmi Calc Start Success !");
        
    }

}
