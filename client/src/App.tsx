import Header from './components/Header';
import Feature from './components/Feature';

export default function Page() {

	return (
		<>
			<Header />
			<Feature room="Featured Luxury Apartment" price="699" amenities={[{"Front Beach" : "3 Bedrooms"}, {"Jacuzzi" : "3 Bathrooms"}, {"Concierge" : "24 hours"}]}/>
		</>
	)
}