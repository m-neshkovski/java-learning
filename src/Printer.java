public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > 100 || tonerLevel <= 0) ? -1 : tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
            int newTonerLevel = this.tonerLevel + tonerAmount;

            if(newTonerLevel > 100) {
                return -1;
            }

            this.tonerLevel = newTonerLevel;

            return this.tonerLevel;
        } else {
            return -1;
        }


    }

    public int printPages(int pagesToBePrinted) {
        int sheetsPrinted = pagesToBePrinted;

        if(this.duplex) {
            System.out.println("Duplex mode for the printer");
            sheetsPrinted = (int) pagesToBePrinted / 2 + pagesToBePrinted % 2;
        }

        this.pagesPrinted += sheetsPrinted;

        return sheetsPrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
