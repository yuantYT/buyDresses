package base;

public class Accounts {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String address;
    private String city;
    private String zipCode;
    private String mobilePhone;
    private String addressAlias;

    public Accounts(){
        this.email="12@163.com";
        this.firstName="ting";
        this.lastName="yuant";
        this.password="123456";
        this.address="Street1";
        this.city="New York1";
        this.zipCode="00000";
        this.mobilePhone="11111111111";
        this.addressAlias="aaa";

    }

    public Accounts(String email,String firstName,String lastName,String password,String address,
                    String city,String zipCode,String mobilePhone,String addressAlias){

        this.email=email;
        this.firstName=firstName;
        this.lastName=lastName;
        this.password=password;
        this.address=address;
        this.city=city;
        this.zipCode=zipCode;
        this.mobilePhone=mobilePhone;
        this.addressAlias=addressAlias;

    }

    public String getEmail(){ return this.email; }

    public String getFirstName(){ return firstName; }

    public String getLastName(){ return  lastName;}

    public String getPassword(){return  password;}

    public String getAddress(){return  address;}

    public String getCity(){return  city;}

    public String getZipCode(){return zipCode;}

    public String getMobilePhone(){return mobilePhone;}

    public String getAddressAlias(){return  addressAlias;}



}
