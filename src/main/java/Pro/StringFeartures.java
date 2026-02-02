package Pro;

public class StringFeartures {
    public static void main(String[] args) {

        String sql = "SELECT * FROM user\n" + "WHERE id =10\n" +
                "AND status ='ACIVE';";
        String sql2 = """
                SELECT + FROM user WHERE id = 10
                AND status = 'ACTIVE';
                """;
    }
}
