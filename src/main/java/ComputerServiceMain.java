import org.flywaydb.core.Flyway;

public class ComputerServiceMain {
    public static void main(String[] args) {
        Flyway flyway = Flyway.configure().dataSource(
                        "jdbc:postgresql://localhost:5432/computer_db",
                        "postgres",
                        "georkryt")
                .load();

        flyway.migrate();
    }
}
