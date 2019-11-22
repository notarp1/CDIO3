class Account {
    int balance;

    Account(int startBalance){
        this.balance = startBalance;

    }

    public int updateBalance(int diff){
        this.balance += diff;
       return this.balance;


    }
}


