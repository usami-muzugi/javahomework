class SanMuYunSuan {
	public static void main(String[] args) 
	{
        System.out.println(1 == 1 ? "true" : "false");
        System.out.println(true ? 10 : 20);


        String string = false ? "String" : "string";
        int sum = false ? 10 : 10;

        int var1 = 10086;
        int var2 = 10000;
        System.out.println(var1 > var2 ? var1 : var2);

        System.out.println(var1 % 2 == 0 ? "true" : "false");

        int score = 70;
        String result = score==100 ? "�¶���ͬѧ������":
			score >= 90 ? "�¶���" :
			score >= 80 ? "����" :
			score>=70 ? "����":
			score >= 60 ? "����" : 
			score < 60 ? "��ʱ���Ƥ" :
			"";
        System.out.println(result);

        String response = score >= 60 ? (score >= 70 ? (score >= 80 ? (score >= 90 ? (score == 100 ? "�¶���ͬѧ������" : "�¶���") : "����") : "����") : "����") : "��ʱ���Ƥ";
        System.out.println(response);
	}
}
