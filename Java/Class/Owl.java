public class Owl {
private String familyType; 
private char gender; 
private double weight; 
private String featherSize; 
private boolean nocturnalVision; 

public Owl() {
this.familyType = " ";
this.gender = ' '; 
this.weight = 0;
this.featherSize = " ";
this.nocturnalVision = false;
}

public Owl(String familyType, char gender, double weight) {
this.familyType = familyType;
this.gender = gender;
this.weight = weight;
if (familyType.equals("Strigidae")) {
this.featherSize = "large";
this.nocturnalVision = true;
} else if (familyType.equals("Tytonidae")) {
this.featherSize = "small";
this.nocturnalVision = false;
}
}

public String getFamilyType(){ 
return familyType; 
}

public char getGender(){ 
return gender; 
}

public double getWeight() { 
return weight; 
}

public String getFeatherSize(){ 
return featherSize; 
}

public boolean getNocturnalVision(){ 
return nocturnalVision; 
}

// Setters
public void setFamilyType(String familyType){ 
this.familyType = familyType; 
}
public void setGender(char gender){ 
this.gender = gender; 
}
public void setWeight(double weight){ 
this.weight = weight; 
}
public void setFeatherSize(String featherSize){ 
this.featherSize = featherSize; 
}
public void setNocturnalVision(boolean nocturnalVision){ 
this.nocturnalVision = nocturnalVision; 
}


public String toString(){
return "This Owl is a " + familyType + ", " + gender + " gender, with a weight of " + weight +
", and a feather size " + featherSize + " and his nocturnal vision is " + nocturnalVision;
}
}
