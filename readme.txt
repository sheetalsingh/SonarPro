Youtube Tutorial: 
https://www.youtube.com/watch?v=EL5Qtl_aqDU&t=238s

###Sonar Qube setup ###
1. Download and Unzip
https://www.sonarqube.org/downloads/
https://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner

2. Set scanner path into path env
C:\Users\Sheetal_Singh\Downloads\sonar-scanner-3.0.3.778-windows\bin

3. Open cmd and run following command to make sure path is set properly
sonar-scanner.bat -v

4. Open sonar-scanner.properties and add following key values pair
path : C:\Users\Sheetal_Singh\Downloads\sonar-scanner-3.0.3.778-windows\conf

sonar.projectKey=SonarPro
sonar.projectName=SonarPro
sonar.projectVersion=1.0
sonar.sources=C:/Users/Sheetal_Singh/Documents/workspace/SonarPro/src/main/java
sonar.java.binaries=C:/Users/Sheetal_Singh/Documents/workspace/SonarPro/target/classes

5. Run sonar qube server
Open cmd and go to: C:\Users\Sheetal_Singh\Downloads\sonarqube-7.0\bin\windows-x86-64
And run: StartSonar.bat
Wait till server starts
Now Open http://localhost:9000/about

6. Run following command to scan your code
sonar-scanner.bat

7.Verify results in http://localhost:9000/projects?sort=-analysis_date