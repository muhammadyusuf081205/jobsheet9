class StackTugasMahasiswa {
    Mahasiswa[] stack;
    int top;
    int size;

    public StackTugasMahasiswa(int size) {
        this.size = size;
        stack = new Mahasiswa[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa pop() {
        if (!isEmpty()) {
            Mahasiswa mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk diambil.");
            return null;
        }
    }

    public Mahasiswa peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + " " + stack[i].nim + " " + stack[i].kelas);
        }
    }
}