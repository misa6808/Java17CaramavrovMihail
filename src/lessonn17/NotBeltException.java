package lessonn17;
// Второе пусть является дочерним классом класса Exception и называется NotBeltException.
// Также пусть передает параметр String в конструктор super класса.
class NotBeltException extends Exception {
    public NotBeltException(String message) {
        super(message);
    }
}