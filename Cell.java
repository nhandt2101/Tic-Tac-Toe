
public class Cell {
    
    private String cellStatus;
    public Cell()
    {
        this.cellStatus = " ";
    }
    public String getCellStatus() {
        return this.cellStatus;
    }
    public void setCellStatus(String s) {
        this.cellStatus = s;
    }
    boolean isFilled() {
        if (this.cellStatus == " ") return false;
        return true;
    }
}