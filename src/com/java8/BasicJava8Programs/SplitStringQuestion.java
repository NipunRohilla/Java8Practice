package com.java8.BasicJava8Programs;

public class SplitStringQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Start....");
		String str="[inherited]:client-markup-service-parent:pom";
		String[] strArray = str.split(":");
		String removeParent = strArray[1];
		String[] clientMarkupServiceParent = removeParent.split("-");
		int parentCount = clientMarkupServiceParent[3].length();
		int countArtifact = removeParent.length();
		String artifact = removeParent.substring(0, countArtifact-parentCount-1);
		System.out.println(artifact);
		
		String artifactNew= clientMarkupServiceParent[0].concat("-")
				.concat(clientMarkupServiceParent[1]).concat("-").concat(clientMarkupServiceParent[2]);
		System.out.println(artifactNew);*/
		String regex = "\\s*\\b-parent\\b\\s*";
//		content = content.replaceAll(regex, "");
		String str="[inherited]:client-markup-parent-service:pom";
		String[] strArray = str.split(":");
		String removeParent = strArray[1]; //	client-markup-service-parent
//		String[] artifact = null;
		if(removeParent.contains("parent")){
			removeParent = removeParent.replaceAll(regex, "");			
		}
		System.out.println(removeParent);
		
		
	}

}
