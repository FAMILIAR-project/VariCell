# VariCell

``VariCell``(a pun with variability, cells as in tabular data/spreadsheets, and varicella aka chickenpox) is an old project for synthesizing variability models from tabular product descriptions. 
More details can be found in the VaMoS'12 paper [1]

Since 2012, the work has evolved towards richer constucts for variability models [3] and a better understanding of product comparison matrices [4]. 
In other words, the project is now alive in the projects [familiar](http://familiar-project.github.com) and [opencompare.org](http://opencompare.org)

## Basic description

see also [2] 

In their current form, semi-structured (e.g., tabular) data are not semantically rich enough to directly translate as a feature model. A key issue is the transformation of data in terms of feature hierarchy and variability. We propose a domain-specific language (DSL), called VariCell, so that practitioners can specify high-level directives and parameterize the data transformation.

The language provides some facilities for:

  * ```Parsing```: A practitioner can import several sources of data (i.e., CSV files) that are then associated to a view. Some parsing instructions, specific to the CSV format, can be specified including the definition of the separator or multivalued separator. The parsing instructions can be specified for all views or for a specific view ; Products/entities are identified by keys (which can be composite keys) and the practitioner can define, for example, which column of the CSV file the keys correspond to. We assume that the same key is used to identify a product in the different data sources. Therefore a key can be specified only in the default part and cannot be redefined in a view.
  * ```Scoping```: A practitioner may scope the data in various ways and for many purposes. For instance, not all products have to be integrated in the family of products since some products are considered as too poor in terms of supported features or not competitive enough. An- other example is that not all features have to be considered, for example, the version number of the product may not be a relevant information. The language directives except products and only products are specified to (not) consider products for all imported views. Note that the DSL directives except features and only features can be specified within a specific view.
  * ```Transforming Data```: It includes renaming or rewriting facilities or more complex mapping. Importantly, the interpretation of data in terms of variability (e.g., to define when a feature is considered to be optional) can be specified either for all data sources and views or for a specific view.
  * ```Specifying Structure```: Views are possibly related to each other (e.g., to describe a sub-domain) and this structuring information is usually not explicit in the format. By default, the feature model of a view is inserted be- low the root feature. A practitioner may want to impose a specific hierarchy. For example, hosting below general means that the feature model of the hosting view is inserted below the feature model of the general view. This information has an impact on the hierarchy of the resulting feature model and is used by the extraction procedure.

## Contributors

in alphabetical order:

  * Mathieu Acher (University of Rennes 1, France / University of Namur, Belgium)
  * Anthony Cleve (University of Namur, Belgium)
  * Philippe Collet (University of Nice Sophia Antipolis, France)
  * Patrick Heymans (University of Namur, Belgium)
  * Philippe Lahire (University of Nice Sophia Antipolis, France)
  * Gilles Perrouin (University of Namur, Belgium)
  * Charles Vanbeneden (University of Namur, Belgium)

## Contact

[Mathieu Acher](http://www.mathieuacher.com)

## References 

 * [1] Mathieu Acher, Anthony Cleve, Gilles Perrouin, Patrick Heymans, Philippe Collet, Philippe Lahire, and Charles Vanbeneden. On Extracting Feature Models From Product Descriptions (2012). In Sixth International Workshop on Variability Modelling of Software-intensive Systems (VaMoS'12)
 * [2] Original page: https://nyx.unice.fr/projects/familiar/wiki/VariCell
 * [3] Guillaume Bécan, Razieh Behjati, Arnaud Gotlieb, and Mathieu Acher. Synthesis of Attributed Feature Models From Product Descriptions (2015). In 19th International Software Product Line Conference (SPLC'15)
 * [4] Guillaume Bécan, Nicolas Sannier, Mathieu Acher, Olivier Barais, Arnaud Blouin, and Benoit Baudry. Automating the Formalization of Product Comparison Matrices (2014). In 29th IEEE/ACM International Conference on Automated Software Engineering (ASE'14)

