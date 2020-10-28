<h2>Project constants and methods</h2>
<html>
 <head></head>
 <body>
  <p>Lucy developed a library class that contains main constants and methods for all projects in her company, but, unfortunately, they have unclear names and meanings.</p> 
  <p>Here is the class containing constants and methods:</p> 
  <pre><code class="language-java">class ConstantsAndUtilities {

    public static final String A_CONSTANT_TTT = "1234";

    public static final String B_CONSTANT_QQQ = "7890";

    public static String getMagicString() {
        return A_CONSTANT_TTT + B_CONSTANT_QQQ;
    }

    public static String convertStringToAnotherString(String s) {
        return A_CONSTANT_TTT + s;
    }
}</code></pre> 
  <p>Write code that prints values of constants and results of both methods in the following order: <code class="language-java">A_CONSTANT_TTT</code>, <code class="language-java">B_CONSTANT_QQQ</code>, <code class="language-java">getMagicString()</code>, <code class="language-java">convertStringToAnotherString("aa")</code>. Each value must be printed in a new line.</p> 
  <p>Use the provided template. The class with constants and methods will be available during testing.</p>
 </body>
</html><br><br><font color="gray">Memory limit: 256 MB</font><br><font color="gray">Time limit: 8 seconds</font><br><br>
<a href="https://hyperskill.org/learn/step/3534">Show topic summary</a>