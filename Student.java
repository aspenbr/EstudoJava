class Student { 
    int id = 1000; 
    int nextId = id + 1; 


    void compute () { 
        System.out.println("id: " + id);
        System.out.println("netxt id:  " + nextId);
    }

    public static void main (String[] args) {
        Student bruno = new Student();
        bruno.compute();
    }
}

// Variable not initialized start with 0 
