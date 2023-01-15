![Logo](/Logo.png)

# Forge Mixin 1.7.10
A template to get you started with Forge and Mixins 

## Workspace Setup
1. Clone or download the repository either using git or the zip download.
2. Open the now downloaded folder and copy the path.
3. Open a command proment or terminal and change the directory to the copied path. 
```
cd C:\User\Desktop\ForgeMixin1.7.10
```
4. Creating the workspace for your IDE <br>
- IntelliJ IDEA
```
gradlew setupDecompWorkspace idea
```
- Eclipse
```
gradlew setupDecompWorkspace eclipse
```
5. Open the project with your preferred IDE. Don't import it as a gradle project.
6. To get Mixins working in a Dev Environment, add the args below, to your program arguments.
```
--tweakClass org.spongepowered.asm.launch.MixinTweaker --mixin mixins.examplemod.json
``` 
Project uses ForgeGradle by anatawa12 [Repository](https://github.com/anatawa12/ForgeGradle-1.2)