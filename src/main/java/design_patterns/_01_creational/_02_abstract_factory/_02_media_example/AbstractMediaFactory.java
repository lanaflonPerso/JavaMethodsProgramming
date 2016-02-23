package design_patterns._01_creational._02_abstract_factory._02_media_example;

public abstract class AbstractMediaFactory {
    public abstract TcpMediaContent createTcpObject();
    public abstract UdpMediaContent createUppObject();
}
