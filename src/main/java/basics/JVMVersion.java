package basics;

public class JVMVersion {

    public static void main(String[] args) {
        String jvmVersion = System.getProperty("java.vm.version");
        System.out.println("JVM version: " + jvmVersion);
    }
}
