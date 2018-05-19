/**
 * @see java
 * @version v1.0
 * @author ning
 * @since 2018
 * @return nothing
 *
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
