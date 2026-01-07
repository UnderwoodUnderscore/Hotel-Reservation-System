import { useState } from 'react';
import Header from './components/Header';
import Feature from './components/Feature';
import SideContent from './components/SideContent.tsx';

export default function Page() {

	const [showBooking, setShowBooking] = useState(false);

	function handleBooking() {
		setShowBooking(!showBooking);
	}

	return (
		<>
			<Header />
			<Feature room='Featured Luxury Apartment' price='699' amenities={[{'Front Beach' : '3 Bedrooms'}, {'Jacuzzi' : '3 Bathrooms'}, {'Concierge' : '24 hours'}]} onBooking={handleBooking} />
			<SideContent side='right' display={showBooking ? '' : 'hidden'} onBooking={handleBooking} />
		</>
	)
}