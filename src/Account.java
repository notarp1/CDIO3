class Account {
    int balance;
    int previousFelt;
    int currentFelt;
    int restFelt;

    Account(int startBalance, int currentBalance, int oldBalance, int caseNumber){
        this.balance = startBalance;
        this.currentFelt = currentBalance;
        this.previousFelt = oldBalance;
        this.restFelt = caseNumber;
    }
}


