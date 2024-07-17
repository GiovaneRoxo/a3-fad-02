package pages;

import lancamento.LancamentoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Lancamento extends LancamentoPage {

    @FindBy(id = "Adicionar")
    private WebElement btnAdicionar;
    @FindBy(id = "Editar")
    private WebElement btnEditar;
    @FindBy(id = "Exibir")
    private WebElement btnExibir;
    @FindBy(id = "Excluir")
    private WebElement btnExcluir;
    @FindBy(id = "idLancamento")
    private WebElement txIdLancamento;
    @FindBy(id = "ExcluirBase")
    private WebElement btnExcluirBase;


    public Lancamento clicarAdicionar() {
        btnAdicionar.click();
        return this;
    }
    public Lancamento clicarEditar() {
        btnEditar.click();
        return this;
    }
    public Lancamento clicarExibir() {
        btnExibir.click();
        return this;
    }
    public Lancamento clicarExcluir() {
        btnExcluir.click();
        return this;
    }

    public Lancamento informarIdLancamento (String idLancamento){
        txIdLancamento.sendKeys(idLancamento);
        return this;
    }

    public Lancamento clicarExcluirLancamento() {
        btnExcluirBase.click();
        return this;
    }


public Lancamento(WebDriver driver){
        super(driver);
    }
}
