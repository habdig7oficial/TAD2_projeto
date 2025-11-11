package tokens.asm;

public class Mov extends Instruction {
    public Mov(String name, int lineNumber) {
        super(name, (short) 2, (short) 2, lineNumber);
    }
    @Override
    protected void callMethod(String... args) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'callMethod'");
    }
}
