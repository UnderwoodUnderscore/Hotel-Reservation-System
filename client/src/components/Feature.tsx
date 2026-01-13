export default function Feature({ imageSrc, imageAlt }) {

    return (
        <>
            <img className='featureImg' src={imageSrc ?? ''} alt={imageAlt ?? ''} />
        </>
    )
}