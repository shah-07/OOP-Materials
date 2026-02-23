package mainpackage.midterm_2420181_sec5;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArticleView
{
    @javafx.fxml.FXML
    private TableView<Article> articleTV;
    @javafx.fxml.FXML
    private ToggleGroup typeGroup;
    @javafx.fxml.FXML
    private DatePicker publicationDateDP;
    @javafx.fxml.FXML
    private RadioButton reviewRB;
    @javafx.fxml.FXML
    private RadioButton bookRB;
    @javafx.fxml.FXML
    private TableColumn<Article, String> titleTC;
    @javafx.fxml.FXML
    private TableColumn<Article, Integer> numberOfAuthorsTC;
    @javafx.fxml.FXML
    private CheckBox citationStatusCB;
    @javafx.fxml.FXML
    private TextField authorTF;
    @javafx.fxml.FXML
    private RadioButton caseRB;
    @javafx.fxml.FXML
    private TableColumn<Article, String> citationTC;
    @javafx.fxml.FXML
    private TextField titleTF;
    @javafx.fxml.FXML
    private TextField numberOfAuthorsTF;
    @javafx.fxml.FXML
    private TableColumn<Article, String> articleTypeTC;
    ArrayList<Article> articleList = new ArrayList<>();
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {

        titleTC.setCellValueFactory(new PropertyValueFactory<>("title"));
        numberOfAuthorsTC.setCellValueFactory(new PropertyValueFactory<>("numberOfAuthors"));
        citationTC.setCellValueFactory(new PropertyValueFactory<>("citationStatus"));
        articleTypeTC.setCellValueFactory(new PropertyValueFactory<>("articleType"));

    }

    @javafx.fxml.FXML
    public void showToTableButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addToArrayLIstButtonOA(ActionEvent actionEvent) {

        //String title = titleTF.getText();
        //String author = authorTF.getText();
        //int numAut = Integer.parseInt(numberOfAuthorsTF.getText());
        //LocalDate date = publicationDateDP.getValue();

        String citation = "";

        if (citationStatusCB.isSelected()){
            citation = "Yes";
        }
        else {
            citation = "No";
        }

        String articleType = "";
        if(bookRB.isSelected()){
            articleType = "Book";
        }
        else if(reviewRB.isSelected()){
            articleType = "Review";
        }
        else if (caseRB.isSelected()){
            articleType = "Case";
        }

        Article a = new Article(titleTF.getText(), authorTF.getText(), articleType, citation, publicationDateDP.getValue(), Integer.parseInt(numberOfAuthorsTF.getText()));

        //articleList.add(a);

        for (Article x : articleList){
            if(x.getTitle().equals(titleTF.getText())){
                messageLabel.setText("Article already exists");
                return;
            }
        }
        articleList.add(a);
        messageLabel.setText("Article added successfully");

    }
}