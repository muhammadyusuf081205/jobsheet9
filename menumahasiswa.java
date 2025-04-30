class Mahasiswa {
    String nama;
    String nim;
    String kelas;
    int nilai;

    public Mahasiswa(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}