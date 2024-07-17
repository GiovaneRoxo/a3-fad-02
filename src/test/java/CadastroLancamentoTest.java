import lancamento.LancamentoTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CadastroLancamentoTest extends LancamentoTest {
    @Test
    public void validarCadastro() {
        CadastroLancamentoTest page = new CadastroLancamentoTest(getDriver());

        String resultado = page.clicarExcluir()
                .informarIdLancamento("01")
                .clicarExcluirLancamento();
        try{
            getDriver().wait();
            Assert.assertTrue(resultado.contains("Lancamento excluido corretamente"));
        }
        catch (Exception e){
            System.out.println(e.toString());
        }


    }

}
