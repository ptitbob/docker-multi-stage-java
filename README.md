> En construction

build de l'image avec la version du clone en "dur" : 

```bash
docker build -t shipstone/test:1.1 .
```

build de l'image avec des paramètre de build : 

```bash
docker build --build-arg version=1.1 -t shipstone/test:arg .
```