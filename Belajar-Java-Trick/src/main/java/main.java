public class main {
    public static void main(String[] args) {
//        Customer customer = new Customer();
//        customer.setId(23);
//        customer.setNama("Hasbi");
//        customer.setGender("Pria");

        Customer customer = Customer.builder()
                .id(32)
                .nama("Muhammad Hasbi")
                .gender("Pria")
                .build();

        System.out.println(customer);
    }
}
