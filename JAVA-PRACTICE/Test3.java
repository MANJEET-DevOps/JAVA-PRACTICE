 class Test3 {

        public static void main(String[] args) {
            Test3 obj = new Test3();
            obj.start();
        }
        void start() {
            String stra = "do";
                String strb = method(stra);
            System.out.print(": "+stra + strb);
        }
        String method(String stra) {
            stra = stra + "good";
            System.out.print(stra);
            return "good";
        }
    }

