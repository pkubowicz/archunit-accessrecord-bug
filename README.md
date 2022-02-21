Reproduces a bug in ArchUnit 0.23.0. Running:

```shell
./gradlew test -ParchUnitVersion=0.23.0
```

causes:

```
java.lang.IllegalStateException: Never found a JavaCodeUnit that matches supposed origin
CodeUnit{name='keyOf', descriptor=(Ljava/lang/Object;)Ljava/lang/Object;, declaringClassName='com.example.CountryValidator$failOnDuplicatedIso$$inlined$groupingBy$1'}
	at com.tngtech.archunit.core.importer.AccessRecord$Factory.getOrigin(AccessRecord.java:325)
	at com.tngtech.archunit.core.importer.AccessRecord$Factory.access$1200(AccessRecord.java:67)
	at com.tngtech.archunit.core.importer.AccessRecord$Factory$10.get(AccessRecord.java:314)
	at com.tngtech.archunit.core.importer.AccessRecord$Factory$10.get(AccessRecord.java:311)
	at com.tngtech.archunit.thirdparty.com.google.common.base.Suppliers$NonSerializableMemoizingSupplier.get(Suppliers.java:167)
	at com.tngtech.archunit.core.importer.AccessRecord$Factory$RawAccessRecordProcessed.getOrigin(AccessRecord.java:282)
	at com.tngtech.archunit.core.importer.ClassGraphCreator.tryProcess(ClassGraphCreator.java:146)
```
