export class Leads {
    id: number;
    firstName: string;
    lastName: string;
    phoneNumber: number;
    email: string;
    dob: string;
    pincode: number;
    gender: string;
    smoker: string;
    alcoholic: string;
    address: string;
    dependant: string;
    annualIncome: string;
    govRebate: number;
    taxRebate: number;
    idProof: string;
    financialProof: string;
    quotationRef: string;
    premium: string;
    product: string;
    sum: number;
    leadStage: string;
    contacted: string;



    constructor(
        id: number,
        firstName: string,
        lastName: string,
        phoneNumber: number,
        email: string,
        dob: string,
        pincode: number,
        gender: string,
        smoker: string,
        alcoholic: string,
        address: string,
        dependant: string,
        annualIncome: string,
        govRebate: number,
        taxRebate: number,
        idProof: string,
        financialProof: string,
        quotationRef: string,
        premium: string,
        product: string,
        sum: number,
        leadStage: string,
        contacted: string,
    
    
        ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dob = dob;
        this.pincode = pincode;
        this.gender = gender;
        this.smoker = smoker;
        this.alcoholic = alcoholic;
        this.address = address;
        this.dependant = dependant;
        this.annualIncome = annualIncome;
        this.govRebate = govRebate;
        this.taxRebate = taxRebate;
        this.idProof = idProof;
        this.financialProof = financialProof;
        this.quotationRef = quotationRef;
        this.premium = premium;
        this.product = product;
        this.sum = sum;
        this.leadStage = leadStage;
        this.contacted = contacted;


    }



}
