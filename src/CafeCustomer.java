public class CafeCustomer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;

    public CafeCustomer(int customerId, String firstName, String lastName, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String[] returnData(){
        String[] data = new String[4];
        data[0] = ""+customerId;
        data[1] = firstName;
        data[2] = lastName;
        data[3] = email;
        return data;
    }

    @Override
    public String toString() {
        return
                "ID:" + customerId + " "+ firstName +
                        " " + lastName +
                        " Email:" + email;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CafeCustomer)) {
            return false;
        }
        CafeCustomer other = (CafeCustomer) obj;

        return (this.customerId == other.customerId || this.email.equals(other.email));
    }


}
