public class DemoInterfaces {
    public static void main(String[] args {

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.deposita( double valor: 500);
        cp.deposita( double valor: 500);

        cc.saca( double valor: 100);
        cp.saca( double valor: 150);

        GeradorDeExtrato exrato = new GeradorDeExtrato();
        extrato.geraExtrato(cc);
        extrato.geraExtrato(cp);

    })
}
