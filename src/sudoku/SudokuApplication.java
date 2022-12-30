package sudoku;
import javafx.*;
import javafx.application.Application;

import java.io.IOException;

public class SudokuApplication extends Application {
    private IUserInterfaceContract.View uiImpl;

    public void start(Stage primaryStage) throws Exception{
        uiImpl = new UserInterfaceImple(primaryStage);
        try{
            SudokuBuildLogic.build(uiImpl);
        } catch(IOException e){
            e.printStackTrace();
            throw e;
        }
    }
    public static void main(String[] args) {launch(args);}
}
