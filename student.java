class student{
    int id;
    String name;
    double gpa;
    int age;
    String school;
    String degree;
    double zscore;
    int rank;
    student next;

    public student(int id, String name, double gpa, int age, String school, String degree, double zscore, int rank){
        this.id=id;
        this.name=name;
        this.gpa=gpa;
        this.age=age;
        this.school=school;
        this.degree=degree;
        this.zscore=zscore;
        this.rank=rank;
        this.next=null;

    }

}