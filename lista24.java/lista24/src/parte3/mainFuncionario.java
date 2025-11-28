package parte3;

public class mainFuncionario {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setNome("Carlos");
        g.setSalarioBase(5000);
        g.setDepartamento("Vendas");

        Vendedor v = new Vendedor();
        v.setNome("Mariana");
        v.setSalarioBase(2000);

        System.out.println("=== GERENTE ===");
        g.exibirInfo();
        System.out.println("Salário com bônus: R$ " + g.calcularSalario());
        g.gerenciar();

        System.out.println("\n=== VENDEDOR ===");
        v.exibirInfo();
        System.out.println("Salário com comissão: R$ " + v.calcularSalario());
        v.vender();
    }
}
